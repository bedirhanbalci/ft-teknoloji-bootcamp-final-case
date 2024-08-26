package com.patika.searchservice.model.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "exceptions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDocument {

    @Id
    private String _id;

    @Field(type = FieldType.Text)
    private String message;

    @Field(type = FieldType.Text)
    private String createdDateTime;

}
