console.log("Abid")


signUpButton = document.querySelector("#signUpButton")

// signUpButton.addEventListener('click', function(){
//     console.log("This is addEventListener")
// })


signUpButton.onclick = function(){
    console.log("this is onclick")
    
    registName = document.getElementById("registName").value;
    registEmail = document.getElementById("registEmail").value;
    registPassword = document.getElementById("registPassword").value;
    
}