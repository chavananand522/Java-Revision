# ATM Simulation System

## 📌 Project Overview

The **ATM Simulation System** is a console-based Java application that simulates basic ATM operations. Users can log in using an ATM PIN and perform various banking operations, including checking balance, depositing money, withdrawing money, viewing transaction history, and changing their PIN.

## 🚀 Features

- **PIN Authentication:** Login with a maximum of 3 attempts.
- **Check Balance:** View the available account balance.
- **Deposit Money:** Deposit money into the account.
- **Withdraw Money:** Withdraw money with balance validation.
- **Transaction History:** View recorded deposit and withdrawal transactions.
- **Change PIN:** Change the existing PIN after verifying the current PIN.
- **Input Validation:** Prevent invalid or non-positive deposit and withdrawal amounts.
- **Exit:** Exit the ATM application.

## 🛠️ Technologies Used

- Java
- Scanner Class
- Arrays
- Loops (`while`, `do-while`, `for`)
- Conditional Statements (`if-else`)
- Switch Statement

## 🔐 Default Login Credentials

| Credential | Value |
|---|---|
| ATM PIN | `1234` |
| Initial Balance | ₹10,000 |

## 💻 ATM Menu

```text
========== ATM MENU ==========
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Transaction History
5. Change PIN
6. Exit
```

## 📚 Concepts Practiced

- Java fundamentals
- Variables and data types
- User input using `Scanner`
- Arrays for transaction storage
- Loops and decision-making statements
- Conditional logic and input validation
- Basic banking transaction logic

## ⚠️ Limitations

- Account balance and transaction history are stored in memory.
- Data resets when the application restarts.
- The application supports a single account.
- The PIN is hardcoded for learning purposes.

## 🔮 Future Enhancements

- Integrate a database to store account details and transactions.
- Support multiple users and accounts.
- Add transaction dates and times.
- Implement secure PIN storage.
- Develop a graphical user interface.

## 👨‍💻 Author

**Anand Chavan**

## 📄 License

This project is intended for educational and learning purposes.
