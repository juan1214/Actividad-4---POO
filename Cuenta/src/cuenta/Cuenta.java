/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

/**

* Esta clase denominada Cuenta modela una cuenta bancaria con los
* atributos saldo, número de consignaciones, número de retiros, tasa
* anual de interés y comisión mensual.
@version 1.2/2020
*/
public class Cuenta {
     protected float saldo;
     protected int númeroConsignaciones = 0;
     protected int númeroRetiros = 0;
     protected float tasaAnual;
     protected float comisiónMensual = 0;
     
     public Cuenta(float saldo, float tasaAnual) {
         this.saldo = saldo;
         this.tasaAnual = tasaAnual;
     }
     
     public void consignar(float cantidad) {
         saldo = saldo + cantidad;
         númeroConsignaciones = númeroConsignaciones + 1;
     }
     public void retirar(float cantidad) {
         float nuevoSaldo = saldo - cantidad;
         if (nuevoSaldo >= 0) {
             saldo -= cantidad;
             númeroRetiros = númeroRetiros + 1;
         }else{System.out.println("La cantida a retirar excede el saldo actual.");
     }
     }
     public void calcularInteres() {
         float tasaMensual = tasaAnual / 12;
         float interesMensual = saldo * tasaMensual;
         saldo += interesMensual;
     }
     public void extractoMensual() {
         saldo -= comisiónMensual;
         calcularInteres();
     }
}

