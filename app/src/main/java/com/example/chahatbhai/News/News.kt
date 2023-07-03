package com.example.chahatbhai.News

import android.os.Parcel
import android.os.Parcelable


data class News(var titleImage: Int, var heading:String, var dataDesc:String, var dataDetailImage: Int) :Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(titleImage)
        parcel.writeString(heading)
        parcel.writeString(dataDesc)
        parcel.writeInt(dataDetailImage)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<News> {
        override fun createFromParcel(parcel: Parcel): News {
            return News(parcel)
        }

        override fun newArray(size: Int): Array<News?> {
            return arrayOfNulls(size)
        }
    }
}

