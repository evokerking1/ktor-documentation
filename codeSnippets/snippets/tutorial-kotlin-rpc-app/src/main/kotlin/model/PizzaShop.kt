package com.example.model

import kotlinx.coroutines.flow.Flow
import kotlinx.serialization.Serializable
import kotlinx.rpc.annotations.Rpc

@Rpc
interface PizzaShop {
    /*
    suspend fun orderPizza(pizza: Pizza): Receipt
    */
    suspend fun orderPizza(clientID: String, pizza: Pizza): Receipt
    fun viewOrders(clientID: String): Flow<Pizza>
}

@Serializable
class Pizza(val name: String)

@Serializable
class Receipt(val amount: Double)
