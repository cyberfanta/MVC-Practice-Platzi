package com.cyberfanta.mvcpracticeplatzi.models.offers

import com.google.gson.annotations.SerializedName

data class Offers(

	@field:SerializedName("result")
	val result: Boolean? = null,

	@field:SerializedName("offers")
	val offers: List<OffersItem?>? = null
)

data class CategoryArray(

	@field:SerializedName("Travel")
	val travel: List<String?>? = null,

	@field:SerializedName("Fashion")
	val fashion: List<String?>? = null,

	@field:SerializedName("Health and Beauty")
	val healthAndBeauty: List<String?>? = null,

	@field:SerializedName("Entertainment")
	val entertainment: List<String?>? = null,

	@field:SerializedName("Online Recharge")
	val onlineRecharge: List<Any?>? = null,

	@field:SerializedName("Software and IT")
	val softwareAndIT: List<Any?>? = null,

	@field:SerializedName("Kids and Toddlers")
	val kidsAndToddlers: List<String?>? = null,

	@field:SerializedName("Home and Living")
	val homeAndLiving: List<String?>? = null,

	@field:SerializedName("Electronics and Gadgets")
	val electronicsAndGadgets: List<String?>? = null,

	@field:SerializedName("Grocery")
	val grocery: List<Any?>? = null,

	@field:SerializedName("Gift Items")
	val giftItems: List<Any?>? = null,

	@field:SerializedName("Stationary")
	val stationary: List<String?>? = null
)

data class OffersItem(

	@field:SerializedName("end_date")
	val endDate: String? = null,

	@field:SerializedName("featured")
	val featured: String? = null,

	@field:SerializedName("code")
	val code: String? = null,

	@field:SerializedName("category_array")
	val categoryArray: CategoryArray? = null,

	@field:SerializedName("image_url")
	val imageUrl: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("smartLink")
	val smartLink: String? = null,

	@field:SerializedName("store")
	val store: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("lmd_id")
	val lmdId: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("terms_and_conditions")
	val termsAndConditions: String? = null,

	@field:SerializedName("offer")
	val offer: String? = null,

	@field:SerializedName("offer_text")
	val offerText: String? = null,

	@field:SerializedName("offer_value")
	val offerValue: String? = null,

	@field:SerializedName("categories")
	val categories: String? = null,

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("start_date")
	val startDate: String? = null
)
