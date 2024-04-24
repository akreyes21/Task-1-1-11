class Vehicle:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year

class Car(Vehicle):
    def __init__(self, make, model, year, numberOfDoors):
        super().__init__(make, model, year)
        self.numberOfDoors = numberOfDoors

    def displayDetails(self):
        print("Car Details:")
        print("Make:", self.make)
        print("Model:", self.model)
        print("Year:", self.year)
        print("Number of Doors:", self.numberOfDoors)

# Creating an instance of the Car class and setting attribute values
car = Car("Ford", "Ranger Raptor", 2023, 4)
car.displayDetails()

