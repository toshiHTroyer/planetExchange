# PlanetExchange

**PlanetExchange** is a Java-based interplanetary currency exchange system that simulates fund transfers between different planetary currencies.

## Components:
- **`Currency` (Abstract Class)**: Defines methods for converting to/from Earth Dollars and updating balances.
- **`Exchangable` (Interface)**: Specifies exchange rates and enforces implementation of key currency operations.
- **Currencies (`Mars.java`, `Neptune.java`, `Saturn.java`)**: Implementations of `Currency` for:
  - **`MarsMoney`**: 1.30 Earth Dollars per unit
  - **`NeptuneNuggets`**: 2.00 Earth Dollars per unit
  - **`SaturnSilver`**: 0.87 Earth Dollars per unit
- **`CurrencyMain` (Main Class)**: Demonstrates sample currency exchanges.

## Functionality:
The `exchange()` method converts the specified amount to Earth Dollars and transfers it to the target currency, updating balances and printing transaction details.
