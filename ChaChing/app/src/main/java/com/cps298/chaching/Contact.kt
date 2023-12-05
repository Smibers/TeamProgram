package com.cps298.chaching

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts") //declare entity
class Contact {

    @PrimaryKey(autoGenerate = true) //set primary key
    @NonNull //primary key cannot be null
    @ColumnInfo(name = "card")
    var id: Int = 0

//    @ColumnInfo(name = "ownership")
//    var ownership: String? = null

    @ColumnInfo(name = "cardName")
    var cardName: String? = null

    @ColumnInfo(name = "useCategory")
    var useCategory: String? = null

    @ColumnInfo(name = "fee")
    var fee: String? = null

    @ColumnInfo(name = "expiration")
    var expiration: String? = null

    @ColumnInfo(name = "perk")
    var perk: String? = null

    //var quantity: Int = 0 //from demo, remove and replace with contactNumber
    var cardBrand: String? = null

    constructor() {}

    /*SHOWN IN BOOK BUT DOES NOT SEEM TO BE NEEDED
    constructor(id: Int, productname: String, quantity: Int) {
        this.contactName = productname
        this.quantity = quantity
    }*/

    constructor(cardName: String, expiration: String, cardBrand: String, perk:String, useCategory: String, fee: String) { //variables for DB
        this.cardName = cardName
        this.fee=fee
        this.expiration=expiration
        this.perk=perk
//        this.ownership = ownership
        this.useCategory = useCategory
        this.cardBrand = cardBrand //from demo, use for contactNumber

        //this.id = id
    }
}