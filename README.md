JJUGナイトセミナー2014年9月のセッション
「そんなリザルトキャッシュで大丈夫か？」
のデモアプリです。

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