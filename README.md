﻿# Prueba-Tecnica-Trainee
# Sistema de Reservas de Boletos

Este proyecto implementa un sistema básico de reservas de boletos en consola sin el uso de bases de datos o almacenamiento persistente. El sistema permite a los usuarios seleccionar y reservar asientos en una cuadrícula de 10x10, que representa un mapa de asientos.

## Funcionalidades

- **Mapa de Asientos**: El sistema muestra un mapa visual de los asientos disponibles y reservados. Los asientos libres se marcan con `L` (libre) y los asientos reservados con `X`.
  
- **Reservación de Asientos**:
  - El usuario ingresa el número de fila y columna para seleccionar un asiento.
  - Si el asiento está disponible (`L`), se marca como reservado (`X`).
  - Si el asiento ya está ocupado, se notifica al usuario y se le solicita que elija otro.

- **Ciclo de Reservas**: Permite realizar múltiples reservas. Después de cada reserva, se le pregunta al usuario si desea continuar reservando o finalizar.

## Uso

1. Ejecuta el programa.
2. Sigue las indicaciones para seleccionar un asiento disponible.
3. Decide si continuar reservando o finalizar el proceso.

## Requisitos

- Java Development Kit (JDK) instalado en el sistema.

## Ejecución

1. Clona el repositorio o descarga el archivo.
2. Compila y ejecuta el archivo `Prueba_trainner.java` en un entorno de Java.
