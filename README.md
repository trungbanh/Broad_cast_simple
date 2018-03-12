<html>
    <head>
        
        <meta charset="utf-8">

    </head>
<body>

<h3>hướng dẫn</h3>

<pre>
    Là một trong 4 component lớn trong Android, với mục đích là lắng nghe các sự kiện,
     trang thái của hệ thông phát ra thông qua Intent 
     nhờ đó mà các lập trình viên có thể xử lí được các sự kiện hệ thống ở bên trong ứng dụng của mình.
</pre>

<pre>
đăng kí broadcast có 2 cách 
    cách 1: đăng kí trong manifest

    &#60receiver android:name=".NetworkChangeReceiver" &#62
        &#60intent-filter&#62
            &#60action android:name="android.net.conn.CONNECTIVITY_CHANGE" &#47&#62
        &#60&#47intent-filter&#62
    &#60&#47receiver&#62

    android.net.conn.CONNECTIVITY_CHANGE đây là lệnh lắng nghe thay đổi kết nối Internet 

    cách 2 đăng kí bằng java code 

    trong bài này hướng dẩn bằng cách 1 và sẽ update cách 2 sớm nhất có thể
</pre>

<pre>
    để  gọi và sử dụng BroadcastReceiver chỉ cần tạo 1 lớp và cho thừa kế từ BroadcastReceiver
    hàm sẽ lắng nghe sự kiện thông qua hàm onReceiver 
</pre>

</body>



</html>
