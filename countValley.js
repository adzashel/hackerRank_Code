const path = [ "U" , "D" ,"D" , "D" , "U" , "D" , "U" , "U"];
const steps = 8;



const result = countValley(steps , path);
console.log(result);

function countValley(steps , path) {
    let countUpDown = 0;
    let valley = 0;
    
    for(let step of path) {
        if(step === "D") {
            countUpDown -= 1;
        }else if(step === "U") {
            countUpDown += 1;
            
            if(countUpDown === 0) {
                valley += 1;
            }
        }        
      
    }
    
    return valley;

}





