package it.marcodemartino;

import java.util.List;

public record ShippingOption(String id, String title, List<LabeledPrice> prices) {
}
