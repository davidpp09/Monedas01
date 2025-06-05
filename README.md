# 💱 Conversor de Monedas en Java

Este proyecto es un sistema de conversión de divisas desarrollado en Java, con acceso a tasas de cambio en tiempo real mediante la API de [ExchangeRate](https://www.exchangerate-api.com/).

---

## 🚀 Funcionalidades

- ✅ Menú interactivo por consola
- 🌐 Conexión a API para obtener tasas actualizadas en tiempo real
- 💬 Entrada de usuario amigable mediante `Scanner`
- 🔁 Repetición del flujo hasta que el usuario decida salir
- 🧾 Historial de conversiones realizadas
- 🧠 Comparación de conversiones para evaluar igualdad de datos
- 🔢 Generación aleatoria de IDs de operación

---

## 🔄 Opciones disponibles

1. Mostrar divisas disponibles
2. Convertir de pesos mexicanos a otra divisa
3. Convertir de una divisa extranjera a pesos mexicanos
4. Convertir entre dos divisas extranjeras
5. Salir del programa
6. Ver historial de conversiones


---

## 📦 Tecnologías usadas

- Java 17+
- API pública de ExchangeRate
- `HttpClient` + `Gson`
- IDE: Visual Studio Code (o GitHub Codespaces)

---

## 🧩 Diagrama UML (Texto)


+--------------------------+
|        Principal         |
+--------------------------+
| +main(String[]): void    |
| +conver(int, int): void  |
+--------------------------+

+--------------------------+
|          Menu            |
+--------------------------+
| +exibirMenu(): void      |
+--------------------------+

+--------------------------+
|       Peticiones         |
+--------------------------+
| +conversionDeDivisas(...)|
| +mostrarHistorial(): void|
| +compararConversiones(a,b)|
| +historial: List         |
+--------------------------+

+-------------------------------+
|       ResConversiones         |
+-------------------------------+
| +base_code: String            |
| +target_code: String          |
| +conversion_result: double    |
| +toString(): String           |
| +equals(Object): boolean      |
+-------------------------------+

+-------------------------------+
|     DiccionarioDivisas        |
+-------------------------------+
| +mostrarDivisas(): void       |
+-------------------------------+

+-------------------------------+
|     OperacionConversion       |
+-------------------------------+
| -origen: String               |
| -destino: String              |
| -cantidad: double             |
| +OperacionConversion(...)     |
+-------------------------------+



