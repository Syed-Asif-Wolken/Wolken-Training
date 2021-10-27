$(document).ready(function(){
    $(".submitter").on("click",function(){
        var fn = $("#n1").val();
        var ln = $("#n2").val();
        var email = $("#inputEmail4").val();
        var pwd = $("#inputPassword4").val();
        var cnfpwd = $("#inputPassword5").val();
        var cont = $("#Contact").val();
        var dob = $("#dob").val();
        var city = $("#inputCity").val();
        var country = $("#inputState").val();
        var name_matcher = new RegExp("^([a-z]{3,15})$");
        var email_matcher = new RegExp("^([.*]{6,18})$"); 
        var contact_matcher = new RegExp("^([0-9]{10})$");
        var city_matcher = new RegExp("^[a-z]+$");
        var pwd_valid = new RegExp("^([a-zA-Z0-9]{8,16})$");

        if(!cont.match(contact_matcher)){
            $("#signup_contact").html("<p class='text-danger'>Contact must be 10 digits<p>"); 
        }  
        
        if(!fn.match(name_matcher) || !ln.match(name_matcher)){
            $("#signup_name").html("<p class='text-danger'>Name must be 3-15 characters long and in lowercase<p>");
        }

        if(!email.match(email_matcher)){
            $("#signup_email").html("<p class='text-danger'>Email must be 6-18 characters<p>"); 
        }

        if(!pwd.match(pwd_valid)){
            $("#signup_pass").html("<p class='text-danger'>Password must be 8 to 16 alphanumeric characters<p>");
        }

        if(cnfpwd != pwd){
            $("#signup_passes").html("<p class='text-danger'>Passwords do not match<p>");
        }

        if(dob==""){
            $("#signup_dob").html("<p class='text-danger'>Enter valid Date of Birth<p>"); 
        }

        if ($('input:radio[name=inlineRadioOptions]').is(':checked')) {
        } 
        else {
            $("#signup_radio1").html("<p class='text-danger'>Select radio button<p>");
        }
        if ($('input:radio[name=inlineRadioOptions2]').is(':checked')) {
        } 
        else {
            $("#signup_radio2").html("<p class='text-danger'>Select radio button<p>");
        }
        if(!city.match(city_matcher)){
            $("#signup_city").html("<p class='text-danger'>City must be lowercase<p>"); 
        } 
        if(country==""){
            $("#signup_country").html("<p class='text-danger'>Select Valid Country<p>"); 
        }

    return false;
    });
    
});