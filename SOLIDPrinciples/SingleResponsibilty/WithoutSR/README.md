### Issues in class Invoice (Why it does not follow Single Responsibility Principle)

Single Responsibility suggests each class should have one reason to change.
The invoice class provided has 3 reasons to change - 
1. If the ```calculatePrice()``` function is changed.
2. If the logic for ```printInvoice()``` is changed.
3. If the logic for ```saveToDB()``` is changed or in future if you want to add ```saveToFile()```.