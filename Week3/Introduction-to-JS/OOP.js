//OOP concepts in JS


//Encapsulation - using closures 
//Polymorphism - override prototype methods but not overload
//Inheritance - achieved using prototypical inheritance (object based)

//How is inheritance achieved in Java?
    // Child classes to adopt behaviors and attributes from parents!

//In Javascript, we DO NOT HAVE class based inheritance 
//Inheritance is based around objects themselves. 

let a = {};

// console.log(a);

/*
    In JS, when it comes to inheritance, it only has one construct: objects. 

    Each object jas a private property which holds a link to another object, called it's prototype.

    The prototype has a porototype of its own and so on, until an object has reach a null as it's 
        prototype. 
*/

//constructor:
function newStuff(){
    this.a =1;
    this.b = "2";
};

let o = new newStuff();

newStuff.prototype.b = 3;
newStuff.prototype.c = 5;

// console.log(o);

//example

let animal = {
    nickname: "bob",
    ability(x){
        console.log("look at me jump!");
    }
};

let dog = {
    bark(){
        console.log("bark");
    },
    __proto__: animal
}

let germanSheppard = {
    bark(){
        console.log("barking in German")
    },
    __proto__ : dog
}

// console.log(animal);
// dog.ability(1);
// dog.bark();
// console.log(dog.nickname);
// germanSheppard.bark();
// germanSheppard.bark(2);
// germanSheppard.bark(2,3);
// console.log(animal);

//----------------------------------------------------------------------------------------
//ENCAPSULATION

//nested functions, a function inside a function. 
//outside function scope is available to inside function, but not available to global. 
//!)Access to it's own scope
//2) Access to the outer funciton scopes
//3) Access to global variables. 

//Return functions
//This function will return a function. 

let fruit = "apples"
function functionGenerator(){
    console.log(`outside function 
                    Here's a ${fruit}`)
    return function() {
        console.log("Here's the returned function. ")
    }
}

let f = functionGenerator; //Assigns f to be the functionGenerator

//With paraenthiss I'm invoking the function. 
let babyF = functionGenerator(); //Assign the returned function. 

f();
babyF();


//Self invoking function

let func1 = function(){
    console.log("Inside IIFE");
    let q ="super secret";
    return "apples";
}();

function closureFucntion(){

    //q exists in parent function scope
    let q = "secret";

    return function(changeSecret){ //child function holds a reference to q 
        console.log(`I know a old secret!
                        Here's a ${q}`)
        q = changeSecret;
        console.log(`I know a new secret!
                        Here's a ${q}`)
        return q;
    }

}

let funcy = closureFucntion();
let funcy2 = closureFucntion();
console.log(funcy);

funcy("Tomato is a fruit");
