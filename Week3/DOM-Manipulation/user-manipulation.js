
function changeEverything(){

    let allPTags = document.getElementsByTagName("p");

    // console.log(allPTags)

    for(let i = 0;i< allPTags.length; i++){
        // console.log(allPTags[i].innerHTML);
        allPTags[i].innerHTML = "We're replacing everything!"
    }
}

window.onload = function(){
    //When the page loads up, we want to assign a eventlistener to out button
    //An event can be: 
            // click
            // change
            // mousehover
            // mouse leaving an area 
            // mouseenter 

        let myButton = document.getElementById("myButton");

        let mySpecialParagraph = document.querySelector("p");

        console.log(mySpecialParagraph);
        
        // console.log("The function has been linked to the button being clicked!");

        mySpecialParagraph.addEventListener('mouseenter', changeEverything);

        myButton.addEventListener('click',changeEverything);

}

// changeEverything();


console.log(myButton);