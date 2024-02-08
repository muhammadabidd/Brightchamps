var time = document.getElementById('time');
var start = document.getElementById('button_start');
var stopp = document.getElementById('button_stop');
var reset = document.getElementById('button_reset');

var interval = 1
var milisecond = 0
var detik = 0
var menit = 0

start.onclick = function(){
    console.log('ini tombol start')
    count()
}

stopp.onclick = function(){
    console.log('ini tombol stop')
}

reset.onclick = function(){
    console.log('ini tombol reset')
}


function count(){

    milisecond = milisecond + interval

    if(milisecond >= 60 ){
        detik = detik + interval
        milisecond = 0
    }
    
    if(detik >= 60){
        menit = menit + interval
        detik = 0
    }
    time.textContent = menit + ':' + detik +  ':' +  milisecond

    timer()
}


function timer (){
    t = setTimeout(count, 1)
}