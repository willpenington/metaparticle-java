/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.metaparticle.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EnvVar model.
 */
public class EnvVar {
    /**
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the EnvVar object itself.
     */
    public EnvVar withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the EnvVar object itself.
     */
    public EnvVar withValue(String value) {
        this.value = value;
        return this;
    }

}
