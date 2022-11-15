package com.example.passportotabekaka.models

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey


@Entity(tableName = "my_passport")
class User {
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null

    var image:String? = null
    var surname:String? = null
    var name:String? = null
    var birthday:String? = null
    var series:String? = null


    @Ignore
    constructor(id: Int?, image:String? ,  surname: String?, name: String?, birthday: String?, series: String?) {
        this.id = id
        this.image = image
        this.surname = surname
        this.name = name
        this.birthday = birthday
        this.series = series
    }

    constructor(image:String?, surname: String?, name: String?, birthday: String?, series: String?) {
        this.image = image
        this.surname = surname
        this.name = name
        this.birthday = birthday
        this.series = series
    }


}