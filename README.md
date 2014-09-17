JJUGナイトセミナー2014年9月のセッション
[「そんなリザルトキャッシュで大丈夫か？」](http://www.slideshare.net/makingx/jjug)
のデモアプリです。


    mvn spring-boot:run

でアプリが起動します。以下のデモを実行するたびに再起動してください。

## demo1

    ab -c 50 -n 50 localhost:8080/calc?n=7651287041371
    curl -X GET localhost:8080/stats

## demo2

    ab -c 50 -n 50 localhost:8080/calc2?n=7651287041371
    curl -X GET localhost:8080/stats

## demo3

    ab -c 50 -n 50 localhost:8080/calc3?n=7651287041371
    curl -X GET localhost:8080/stats

## demo4

    ab -c 50 -n 50 localhost:8080/calc4?n=7651287041371
    curl -X GET localhost:8080/stats
