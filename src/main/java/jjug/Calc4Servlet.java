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

public class Calc4Servlet extends HttpServlet {
    private static final ConcurrentHashMap<BigInteger, List<BigInteger>> cache = new ConcurrentHashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BigInteger n = new BigInteger(req.getParameter("n"));
        List<BigInteger> result = cache.computeIfAbsent(n, PrimeFactors::divide);
        PrintWriter writer = resp.getWriter();
        writer.println(result);
        writer.flush();
    }
}
