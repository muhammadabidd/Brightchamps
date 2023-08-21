function showTime(){
    var date = new Date();

    var h = date.getHours();
    var m = date.getMinutes();
    var s = date.getSeconds();

    s = (s < 10) ? "0" + s : s;
    console.log("Arsya suka makan rendang")
    var time = h + ':' + m + ":" + s;
    document.getElementById("clockdisplay").innerText = time;
    setTimeout(showTime,1000);
}


showTime();

umur = 16

umur = (umur > 17) ? "kamu sudah boleh buat sim" : "belum boleh mengendarai " ;

console.log(umur)

