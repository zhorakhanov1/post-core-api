package com.example.postcoreapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostModel {

    @Valid
    private String postId;
    @NotNull
    @Valid
    private String clientId;
    @NotNull
    @Valid
    private String postRecipientId;
    @Valid
    private String postItem;
    @Valid
    private String status;
}
