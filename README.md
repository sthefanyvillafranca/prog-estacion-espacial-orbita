 Piensa en el array estático como las plataformas de aterrizaje fijas de una estación espacial: tienes un número exacto de bahías, y cada una puede estar vacía (`null`) u ocupada por una nave.
---
# 🚀 Sistema de Gestión – Estación Espacial Órbita

## 🎯 Objetivo

Aplicar de forma autónoma el patrón de gestión utilizando:

* Clases y objetos
* Composición
* Arrays unidimensionales de tamaño fijo
* Métodos bien estructurados
* Javadoc correcto
* Código limpio y ordenado

> Este ejercicio mantiene la estructura técnica requerida para practicar POO y los ejercicios realizados en clases, pero ambientado en la gestión de una flota estelar.

---

## 📖 Escenario

Una estación espacial gestiona un máximo de **20 naves estelares** atracadas simultáneamente.

Cada nave está identificada mediante un **código de registro (id) único** y dispone de la siguiente información:

* `id` (int)
* `nombre` (String)
* `clase` (String) *(Ej: Exploración, Carga, Combate)*
* `capacidadTripulantes` (int)

El sistema debe permitir registrar las naves que llegan, buscarlas, mostrar el inventario de la flota atracada y contar cuántas naves hay actualmente en la estación.

---

## 🧩 Requisitos técnicos

### 1️⃣ Clase `Nave`

Debe incluir:

* Atributos privados.
* Constructor completo.
* Métodos getters.
* Método `toString()` (usar `String.format`).
* Javadoc en: clase, constructor y métodos públicos.

---

### 2️⃣ Clase `EstacionEspacial`

Debe incluir:

#### Atributos

```java
private Nave[] navesAtracadas;
private final int NUM_MAX_NAVES;

```

#### Constructor

* Debe inicializar la capacidad máxima en 20 y crear el array de naves.

### Métodos obligatorios

```java
public Nave buscarNave(int id);
private int buscarPrimeraBahiaLibre();
public boolean atracarNave(Nave nave);
public String mostrarFlota();
public int contarNavesAtracadas();

```

---

## 🔍 Comportamiento esperado

* **`buscarNave(int id)`:** Recorre las plataformas. Devuelve la nave con ese id o `null` si no la encuentra.
* **`buscarPrimeraBahiaLibre()`:** Devuelve el índice de la primera posición `null`. Si la estación está llena, devuelve `-1`.
* **`atracarNave(Nave nave)`:** Solo permite atracar si no hay otra nave con el mismo id y si hay al menos una bahía libre. Devuelve `true` si el atraque es exitoso, `false` en caso contrario.
* **`mostrarFlota()`:** Construye y devuelve un `String` (usando `StringBuilder`) con los datos de las naves que no sean `null`.
* **`contarNavesAtracadas()`:** Devuelve el número exacto de naves que están actualmente en el array.

---

## 🖥 Clase `Main`

Debe:

1. Crear una `EstacionEspacial`.
2. Registrar al menos 3 naves diferentes.
3. Imprimir la lista de la flota.
4. Mostrar el recuento total de naves.
5. Realizar una búsqueda de una nave que existe y otra de una que no existe, imprimiendo el resultado.

---

## ⭐ Ampliación de ejercicio (Opcional, pero muy recomendado)

* Implementa un método que permita que una nave despegue (eliminarla del array), recibiendo el objeto nave:
  `public Nave despegarNave(Nave nave)`
* Implementa el despegue recibiendo solo el ID:
  `public Nave despegarNave(int id)`
* Implementa un método que reorganice las naves en las bahías, ordenándolas por su ID de mayor a menor y agrupándolas al principio del array (sin dejar huecos `null` entre ellas):
  `public void organizarBahias()`

