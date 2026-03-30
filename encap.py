class bank:

    def __init__(self, balance):
        self.balance = balance #public
    
    def withdraw(self, balance, amount):
        if amount <= balance:
            self.balance-amount
    def display(self):
        print("balance : ", self.balance)

b1 = bank(1000)

b1.withdraw(500)

b1.display()