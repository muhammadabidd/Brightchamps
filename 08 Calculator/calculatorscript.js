function load() {
    var buttons = document.querySelectorAll('#calculator span');
    console.log(buttons);

    var operators = ['+', '-', 'x', '÷' ];
    var inputScreen = document.querySelector('#screen');
    var input

    for(var i=0; i<buttons.length; i++){


        buttons[i].addEventListener('click', function(){
            btnvalue = this.innerHTML;

            input = inputScreen.innerHTML

            switch(btnvalue){
                case 'C':
                    inputScreen.innerHTML  = '';
                    break;
                case '=':
                    var lastChar = input[input.length - 1];
                    if(inputScreen.innerHTML == '' || operators.includes(lastChar)){

                        break;
                    }

                    input = input.replace('x', '*').replace('÷', '/');
                    inputScreen.innerHTML = eval(input);
                    break;
                case '+':
                case '-':
                case 'x':
                case '÷':
                    var lastChar = input[input.length - 1];
 
                    if (operators.includes(lastChar) && input != ''){
                        inputScreen.innerHTML = input.slice(0,-1)
                        inputScreen.innerHTML +=btnvalue
                        break;
                    }

                    if(input == ""){
                        break;
                    }

                    if(!operators.includes(lastChar)){
                        inputScreen.innerHTML +=btnvalue
                        break;
                    }
                    

                default:
                    inputScreen.innerHTML += btnvalue;
                    break;
            }
        })


    }

}



x = 'ayam'

console.log(typeof(x))