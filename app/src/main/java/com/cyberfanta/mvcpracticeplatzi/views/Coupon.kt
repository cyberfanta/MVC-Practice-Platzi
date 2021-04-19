package com.cyberfanta.mvcpracticeplatzi.views

import com.google.gson.JsonObject
import java.lang.Exception
import java.text.ParseException
import java.text.SimpleDateFormat
import java.io.Serializable
import java.util.*

class Coupon(couponJson: JsonObject?) : Serializable {

    var id: String = ""
    var imageUrl: String = ""
    var title: String = ""
    var descriptionShort: String = ""
    var category: String = ""
    var description:String = ""
    var offer: String = ""
    var website: String = ""
    var endDate: String = ""
    var url: String = ""

    init {
        try {
            id                  = couponJson!!.get(ID).asString
            imageUrl           = couponJson.get(IMAGE_URL).asString
            title               = couponJson.get(TITLE).asString
            descriptionShort    = chunkWords(couponJson.get(DESCRIPTION_SHORT).asString, ' ', 5)
            category            = chunkWords(couponJson.get(CATEGORY).asString, ',', 1)
            description         = couponJson.get(DESCRIPTION).asString
            offer               = couponJson.get(OFFER).asString
            website             = couponJson.get(WEBSITE).asString
            endDate             = getFormatDate(couponJson.get(END_DATE).asString)
            url                 = couponJson.get(URL).asString
        } catch (e: Exception){
            e.printStackTrace()
        }
    }

    companion object {
        private val ID                  = "lmd_id"
        private val IMAGE_URL           = "image_url"
        private val TITLE               = "title"
        private val DESCRIPTION_SHORT   = "offer_text"
        private val CATEGORY            = "categories"
        private val DESCRIPTION         = "description"
        private val OFFER               = "offer"
        private val WEBSITE             = "store"
        private val END_DATE            = "end_date"
        private val URL                 = "url"
    }

    private fun getFormatDate(dateCoupon:String):String {
        val format = SimpleDateFormat("yyyy-MM-dd", Locale.ROOT)
        val dateFormat = SimpleDateFormat("dd MMMM yyyy", Locale.ROOT)
        try {
            val parsedDateFormat = format.parse(dateCoupon) as Date
            val cal = Calendar.getInstance()
            cal.time = parsedDateFormat
            return dateFormat.format(cal.time)
        } catch (e: ParseException) {
            e.printStackTrace()
            return ""
        }
    }

    private fun chunkWords(string: String, delimiter: Char, quantity: Int): String {
        val words = string.split(delimiter)
        var newString = ""

        for (i in 0..quantity){
            newString += words[i] + " "
        }

        return newString
    }
}