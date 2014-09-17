package jjug;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;

public class Calc3Servlet extends HttpServlet {
    private static final ConcurrentHashMap<BigInteger, FutureTask<List<BigInteger>>> cache = new ConcurrentHashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BigInteger n = new BigInteger(req.getParameter("n"));
        FutureTask<List<BigInteger>> result = cache.get(n);
        if (result == null) {
            FutureTask<List<BigInteger>> ft = new FutureTask<>(() -> PrimeFactors.divide(n));
            result = cache.putIfAbsent(n, ft);
            if (result == null) {
                ft.run();
                result = ft;
            }
        }
        PrintWriter writer = resp.getWriter();
        try {
            writer.println(result.get());
        } catch (Exception e) {
            // TODO
            cache.remove(n);
            e.printStackTrace();
        }
        writer.flush();
    }
}
