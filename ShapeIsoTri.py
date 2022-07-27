class ITriangle:
    def __init__(self, height, base, *sides):
        self.height = height
        self.sides = sides
        self.base = base

    #def printResults(self):
        #checks if height and base is 1 input, and if *sides are 2 inputs
        #if((self.height) == 1 and (self.base) == 1 and len(self.sides) == 2 
        #checks if the two sides are equal and greater than the base when the two are added together
        #and self.sides[0] == self.sides[1] and self.sides[0] + self.sides[1] >= self.base[0]):
            #formula for the area of the triangle(b*h/2) and perimeter(2a+b)
            #a = self.base[0] * self.height[0] / 2
            #p = 2 * a + self.base[0]
            #print("%.1f %.1f" % (p, a))
        #prints if user input does not pass condition checks
        #else:
            #print("Isoceles Triangle Error!")
        
    def printResults(self):
        if (self.height) == 1 and (self.base) == 1 and len(self.sides) == 2: 
            if self.sides[0] == self.sides[1] and self.sides[0] + self.sides[1] > self.base[0]:
                a = self.base[0] * self.height[0] / 2
                p = 2 * a + self.base[0]
                print("%.1f %.1f" % (p, a))
        else:
            print("Isoceles Triangle Error!")