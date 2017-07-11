package com.newyorktimes.app.data.model.mostpopular

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MostPopular {

    @SerializedName("status")
    @Expose
    var status: String? = null
    @SerializedName("copyright")
    @Expose
    var copyright: String? = null
    @SerializedName("num_results")
    @Expose
    var numResults: Int? = null
    @SerializedName("results")
    @Expose
    var results: List<Result>? = null
}