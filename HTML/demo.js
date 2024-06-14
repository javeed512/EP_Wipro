

function   verifyAge(){



     var element1 =   document.getElementById("uid");
        console.log(element1.value);

            var name = element1.value;

        var  element2 = document.getElementById("dob");

        var   v1 =    element2.value;

        var     dob =   new Date(v1);

            console.log(dob.getFullYear());

            var age =  2024 - dob.getFullYear();
       

            if(age > 18){

                    alert("HI "+name+"Age is"+ age  +"  you are eligible for Vote ");

            }

            else{

                alert("sorry you are under 18 not eligible for vote");
            }
            

}


function getTime(){


        alert(new Date());


}