//This is an inline comment

/*

    This is a block comment. 


    Created in 1995 by Brandan Eich (in 10 days) 

    JS is loosely typed, intepreted, object-based, scripting language (that's also dynamic).
    Conceived to create additional functionalty to webpages. 

    Benefits: 
        Less server interaction. 
        Increased interactivity 
        ASI (Automatic semicolon insertion)
*/

//print statement 
// console.log("Hello World!");


/*

What are the datatypes in JavaScript?

number 
boolean 
string 
undefined 
null 
symbol (unique and immutable primitive values, can be used as the key for an object)
        - ES6 (Version 6), ECMAScript 2015 
bigint - ES10

object 
array 
function

*/

/*
    What is ES6?
        ECMAScript 2015 - added a lot of features that are commonly used right now
        ECMA is an international body that sets the standard for all scripting langugaes
*/

//In JS, you don't need to declare a datatype. 
//declaration and assignment and intialisation.
let a = 12
// a = 'String';
// console.log(a);

//const acts like the final keyword, need to be initalised and can't be reassigned.
const b = true;

//When a variable is not initalised it's undefined. 
var c; 
c = null;
// c = undefined;

// console.log(c);

/*
Let and Const were introduced in ECMA 2015. 

    let vs const: act the same within the same scopes. const just can't be reassigned. 

    var vs let: 
            var: Global or local. 
            let: Global, local or block. 


*/

/*
Scopes in JS:
    Global: Accessible everwhere
    Local: function/object scope
    Block: within conditional statements (control flow statements)
*/

//Loosely typed 
var myVar = 3;
myVar = "A set of characters";
// myVar = true;
// myVar = null;

// console.log(myVar);

//-------------------------------------------------------------------------------

//CREATING AN ARRAY
//In Javascript we declare an array like a variable
// An array is immutable in size.
// An array does not have to have the same datatypes. 
let arrayOfPlanets = [["Mercury",0,"Don't have rings"], ["Mars",2], "Earth", false];

arrayOfPlanets[3] = ["Jupiter"]; //We select a position using []
arrayOfPlanets[27] = "Pluto"; //We can change the size and assign position anywhere. 

arrayOfPlanets[28] = arrayOfPlanets; //We can create recursive array. 
arrayOfPlanets[28][5] = arrayOfPlanets;
// console.log(arrayOfPlanets);

//---------------------------------------------------------------------------------

//Creating an Object!

let myObject = {}; //We just made an object!

let planet = {
    name: "Earth",
    "distance": 1,
    humans: true
};

//dynamic - we can modify the number pf attributes to an object during runtime. 
planet.rings = true; //dot notation

//boring
planet.rings = false;

//fun
delete planet.distance;

planet.funarrays = [planet];

//Constructors

function Robot(name,ability,weight){
    this.name = name;
    this.ability = ability;
    this.weight = weight;
};

let rob = new Robot("bobby","run really fast",0.8);
console.log(rob);

// console.log(planet["rings"]);

//---------------------------------------------------------------------------------

//Pass by reference vs pass by value 

//primitive datatypes are by value
let num1 = 10;
let num2 = num1;
num1 = 25;

// console.log(num2);

//Objects are pass by reference
let obj1 = { value:10};

let obj2 = obj1;

obj1.value = true;

// console.log(obj2);

//---------------------------------------------------------------------------------------

//Functions
// printStuff();

//We don't need access modifiers and we don't have to specify a return type
function printStuff(){
    var g = 7;
    console.log(g);
    
};

//We don't need to add datatypes to our paramneters 
function add(x,y){
    console.log(typeof(x));
    return x+y;
}
//---------------------------------------------
//anonymous functions
//stored within a variable
let anon = function(a,b){return a*b};
// console.log(anon);

// let ab = anon(7,7);
// console.log(ab);
anon = 3;

// console.log(anon(3,3));

//---------------------------------------------
//callback functions 
//passes a function as a parameter to another function. 

function travel(destination, myFunc){
    console.log("travelling to " + destination);
    let a = myFunc(); //our a variable is equal to "apples"
    return a;
}

function theWeather(){
    console.log("it's a tad warm");
    return "apples";
}

console.log(travel("Cyprus",printStuff));
//---------------------------------------------
//Fat Arrow Notation

let div = (x,y) => {return x/y};
let sayHello = names => {
    console.log(names + " says hello!");
}

//---------------------------------------------
//Self Invoking Function
//functions that call themselves. 
//executes autmoatically if the expression is followed by paranthesis
//IIFE - Immediately Invokable Function Expression

let func1 = function(){
    console.log("Inside IIFE");
}();


// console.log(add("apples ", "and oranges"));
// console.log(add(2,3));

// console.log(g); With var, g does not exist outside of local scope (function)

//Hoisting
/*
    All declarations get moved to the top of their scope 
    var, let and const get moved up, but let and const block the behaviour 
        with variables, you only move the declaration not the initalisation. 
    function:
        Are hoisted completely, with function body as well. 
*/

//----------------------------------------------------------------------------------

/*
Truth vs Falsy values 
EVERYTHING has a true or false boolean value, when used in a conditional statement
    falsy values:
        false (every other number is true)
        0
        null 
        undefined
        "" (non-empty strings are truthy)
        NaN

*/

let k; //undefined 
k = null;
k = 0;
k = "";
k = false;
k = NaN; //NaN = Not a number
k = 1;

//----------------------------------------------------------------------------------

//Control flow statements 

//---------------------------------------
//if blocks
// if(!k){
//     console.log("k is falsy!");
// } else if(k == 1){
//     console.log("k is 1");
// }else {
//     console.log("k is truthy!")
// }
//---------------------------------------

//swtich statements 
// switch(k){
//     case 2:
//         console.log("inside case!");
//         break;
//     default:
//         console.log("inside default!")
// }

//---------------------------------------
//traditional for loops 
// for(let i = 0; i<100;i++){
//     console.log(i);
// }

// console.log( "Outside scope: " + i);

//another loop 
// for(let i =0; i<10;i++){
//     console.log(i);
// }

//---------------------------------------
let foods = ["cake","cookies","pizza","apples"];

let robot = {
    name: "Bob",
    ability: "jump",
    weight: 1
};

// for-in loop: iterates thorugh the key of an object
// for(let j in robot){
//     console.log("Keys: " + j + " |values: " + robot[j]);
// }

// for-each loop: iterates through the values of an iterable, e.g. array
// for(let j of foods){
//     console.log(j);
// }

//---------------------------------------------------------------------------------

//Comparison operators

let test1 = 1;
let test2 = "1";

//We don't check the type , just the value
// console.log(test1 == test2);

//We check the type and the value. 
// console.log(test1 === test2);

//We can still do numerical operator checks
// console.log( test1 > 5);
//We also still have access to not equal opertors != and !==
// console.log(test1 !== test2);

// console.log(10 >= (test2 + 1));

// console.log("2" + 1 +"2");
// console.log(2 + 1 + "2")
// console.log("2" + 1 + 2)

//---------------------------------------------------------------------------------

//Template Literal Strings - ES6 feature

let randoVariable = "Ben";

console.log(randoVariable + " says "+
"\n hello!");

console.log(`${randoVariable} 
                            says
                                        Hello!`);

//---------------------------------------------------------------------------------

/*
    What is NaN?
        Not a keyword or a data type, it is a property of the global object. 
        isNan - function that returns true if variable is not a type of number

        1) dvision of zero by zero
        2) dviision infinity by infinity 
        3) multiplicaition infirnity by zero 
        4) converting a non-numeric string or undefined
*/
console.log(typeof(NaN));
