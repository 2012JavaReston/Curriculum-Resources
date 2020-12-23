console.log("I'm connected!");

// What is the DOM?
// It's like the webpage, Document Object Model 
// Akin to a flow chart. How each tag is being arranged, how each different views are there. 
// Language agnositc, an interface to access particular parts of the documents


//DOM (Document Object Model) - this creates a tree like structure of our html documents 
    // that allows us to manipulate our webpage. 

    //How do we access it? 

// console.log(document);
// console.log(document.all);
// console.log(document.all[3]); //This is a TERRIBLE WAY to select an element

// console.log(document.URL);
// console.log(document.title);
// console.log(document);

//------------------------------------------------------------------------------
//ELEMENTS BY ID
let h1Var = document.getElementById("title");
let h1VarText = h1Var.innerText;

h1Var.innerText = "We're modifiying stuff now!";
h1Var.innerHTML = "We're modifiying stuff now, with even more <strike>power</strike>!";
h1Var.innerText = "We're modifiying stuff now, with even more <strike>power</strike>!";

/*
innerText: HTML tags will not be registered as HTML
innerHTML: HTML tags will be registered as vaild HTML
*/

// console.log(h1VarText);
//------------------------------------------------------------------------------
//Selecting by Class names

// let classVar = document.getElementsByClassName("more-text");
// let nestedPTag = classVar[1].children[0];

// nestedPTag.innerHTML = " I'm still stuck inside of a div tag.";
// console.log(classVar[1].children[0]);

//------------------------------------------------------------------------------

//Selecting by Tag names
// let allPTags = document.getElementsByTagName("p");
// console.log(allPTags);


//-----------------------------------------------------------------------------------

let allPTags = document.getElementsByTagName("p");

// console.log(allPTags)

// for(let i = 0;i< allPTags.length; i++){
//     // console.log(allPTags[i].innerHTML);
//     allPTags[i].innerHTML = "We're replacing everything!"
// }

//-----------------------------------------------------------------------------------

let a = document.querySelector("#nestedPTag");
a.innerHTML = "We're using queryselecto to modify this tag!"

// console.log(document.querySelectorAll(".more-text")[0].innerHTML);

//--------------------------------------------------------------------------------------

//we need to define an element inside of JS

//Create Element inside of JavaScript
let newDiv = document.createElement("div");

//We modified it to our preference
newDiv.innerText = "This is my very new Div tag!";

//We find the element we want to append to 
//In this case our "id = parentDiv" div
let parentDiv = document.querySelector('#parentDiv');

//We append it to our div
parentDiv.appendChild(newDiv);

console.log(parentDiv);