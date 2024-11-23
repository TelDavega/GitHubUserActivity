package es.teldavega.responses;

import com.google.gson.annotations.SerializedName;

public class LabelElement {
    @SerializedName("label")
    public LabelClass labelClassValue;
    @SerializedName("string")
    public String stringValue;
}
