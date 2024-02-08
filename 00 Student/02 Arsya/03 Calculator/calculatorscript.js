function load(){
    var buttons = document.querySelectorAll('#calculator span')
    var input
    var inputScreen = document.querySelector('#screen')
    var operators = ['+', '-', ':', 'x']


    for(var i=0 ; i<buttons.length; i++){


        buttons[i].addEventListener('click', function(){
            buttonvalue = this.innerHTML;
            input = inputScreen.innerHTML
       
            

            if (buttonvalue == "C"){
                console.log("INI BUTTON C ni bos")
                inputScreen.innerHTML = ''
                
            }

            if( buttonvalue == 1){
                console.log("INI BUTTON 1 bosss")
                inputScreen.innerHTML += buttonvalue
            }

            if( buttonvalue == 2){
                console.log("INI BUTTON 2 bosss")
                inputScreen.innerHTML += buttonvalue
            }

            if( buttonvalue == 3){
                console.log("INI BUTTON 3 bosss")
                inputScreen.innerHTML += buttonvalue
            }

            if( buttonvalue == 4){
                console.log("INI BUTTON 4 bosss")
                inputScreen.innerHTML += buttonvalue
            }

            if( buttonvalue == "+"){
                var hurufterakhir = input[input.length - 1]
                console.log("INI BUTTON + bosss")
                
                
                if(operators.includes(hurufterakhir)){
                    console.log("ada tanda plus sebelumnya")
                    inputScreen.innerHTML = inputScreen.innerHTML
                } else{
                    
                    inputScreen.innerHTML += buttonvalue

                }


            }

            if(buttonvalue == '='){
                inputScreen.innerHTML = eval(inputScreen.innerHTML)
            }
            









            

        })

    }  
}