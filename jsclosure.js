let main = () => {
  let c1 = makeCounter();
  let c2 = makeCounter();
  
  console.log(`c1: ${c1()}`);
  console.log(`c2: ${c2()} ${c2()} ${c2()}`);  
  console.log(`c1: ${c1()} ${c1()}`);
}

let makeCounter = () => {
  let count = 0;
  let incrementAndGet = () => {
    count++;
    return count;
  }
  return incrementAndGet;
}

main();