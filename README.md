# header-test

Demo for Spring Security duplicate header problem

To see the problem, run TestApp and access this page

    http://localhost:8080/test
    
You will see `X-Content-Type-Options` header twice,

    HTTP/1.1 200
    X-Content-Type-Options: nosniff
    X-XSS-Protection: 1; mode=block
    Cache-Control: no-cache, no-store, max-age=0, must-revalidate
    Pragma: no-cache
    Expires: 0
    X-Frame-Options: DENY
    X-Content-Type-Options: nosniff
    Transfer-Encoding: chunked
    Date: Fri, 06 Sep 2019 20:04:03 GMT

