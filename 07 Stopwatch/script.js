var time = document.getElementById('time');
var start = document.getElementById('button_start');
var stopp = document.getElementById('button_stop');
var reset = document.getElementById('button_reset');

var ms = 0
var s = 0
var m = 0
var interval = 1
var running = false

start.onclick = function(){
    if (running == false) {
        running = true;
        console.log(running)
        console.log('ini tombol start')
        count();
    }
}

stopp.onclick = function(){
    console.log('ini tombol stop')
    clearTimeout(t)
    running = false;

}

reset.onclick = function(){
    console.log('ini tombol reset')
    time.textContent = '00' + ' : ' + '00' + ' : ' + '00'
    ms = 0
    s = 0
    m = 0
}

function timer(){
    t = setTimeout(count, 10)
}

function count(){
    ms = ms + interval

    if (ms >= 60){
        ms = 0
        s = s + interval
    }

    if (s >= 60){
        s = 0
        m = m + interval
    }
    console.log(ms)
    time.textContent = (m > 9 ? m : '0' + m) + ' : '  + (s > 9 ? s : '0' + s) + ' : '  + (ms > 9 ? ms : '0' + ms)


    timer();
};

