function showTime(){
    var date = new Date();

    var h = date.getHours();
    var m = date.getMinutes();
    var s = date.getSeconds();

    s = (s < 10) ? "0" + s : s;

    var time = h + ':' + m + ":" + s;
    document.getElementById("clockdisplay").innerText = time;
    setTimeout(showTime, 1000);
}


showTime();

