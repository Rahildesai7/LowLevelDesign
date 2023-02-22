### Issues with ```InvoiceDao``` class. (Why it violates Open/Closed Principle)

By adding a new functionality - `saveToFile()`, the current class which is live and tested with `saveToDB()` function is being modified.

Open/Closed principle suggests code extension but not modification.