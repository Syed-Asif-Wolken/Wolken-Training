$(document).ready(function(){
    $(".submitter").on("click",function(){
        var login_pwd = $("#inputPassword14").val();
        var login_email = $("#inputEmail14").val();

        var email_matcher = new RegExp("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$"); 
        var pwd_valid = new RegExp("^([a-zA-Z0-9]{8,16})$");

        var out=true;

        if(!login_email.match(email_matcher)){
            $("#signup_email2").html("<p style='font-size: 14px;' class='text-danger'>Email must be 6-18 characters with proper domain<p>"); 
            out=false;
        }

        if(!login_pwd.match(pwd_valid)){
            $("#signup_passes2").html("<p style='font-size: 14px;' class='text-danger'>Password must be 8 to 16 alphanumeric characters<p>");
            out=false;
        }

    return out;
    });
    
});