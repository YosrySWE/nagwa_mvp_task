package com.nagwa.nagwa_mvp_task.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AttachmentModel(
    @SerializedName("id") @Expose val id : Int,
    @SerializedName("type") @Expose val type : String,
    @SerializedName("url") @Expose val url : String,
    @SerializedName("name") @Expose val name : String,
    var isDownloaded: Boolean = false
)

data class AttachmentResponse(
    @SerializedName("results") @Expose val results: MutableList<AttachmentModel> = mutableListOf()
)