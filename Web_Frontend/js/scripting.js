document.addEventListener("submit",function(e){
    e.preventDefault();
    var f_name = document.getElementById("n1").value;
    if(f_name==""){
        document.getElementById("signup_name").innerHTML="<p class='text-danger'>Name must be 3-15 characters long and in lowercase<p>";
    }
});
