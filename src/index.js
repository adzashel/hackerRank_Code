const socks = [ 10 , 10 , 12 , 21 , 11 , 11 ,5 , 4 ,5 ]

let map = new Map();
let pairs = 0;

for(let i of socks) {
    let sock = map.get(i) ?? 0;
    map.set(i , ++sock);
    if(sock % 2 == 0 ) {
        ++pairs;
    }
}

console.log(pairs);



let totalPage = 6;
let targetPage = 3;

let spreadFromStart = targetPage % 2 == 0 ? targetPage / 2 : (targetPage - 1) / 2;
let spreadFromEnd = ((totalPage % 2 == 0) ? totalPage /2 : (totalPage - 1) / 2) - spreadFromStart;


if(spreadFromStart < spreadFromEnd) { // to find minimum turn pages
console.log(spreadFromStart);
}else {
    console.log(spreadFromEnd);
}