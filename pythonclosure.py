def main():
    c1 = makeCounter()
    c2 = makeCounter()

    print("c1: %d" %(c1()))
    print("c2: %d %d %d" %(c2(), c2(), c2()))
    print("c1: %d %d" %(c1(), c1()))

def makeCounter():
    count = 0
        
    def incrementAndGet():
        # Need nonlocal
        nonlocal count
        count = count + 1
        return count
    
    return incrementAndGet

if __name__ == '__main__':
    main()