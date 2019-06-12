/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * The direct-vm component provides direct, synchronous call to another endpoint
 * from any CamelContext in the same JVM.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DirectVmEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Direct VM component.
     */
    public interface DirectVmEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedDirectVmEndpointConsumerBuilder advanced() {
            return (AdvancedDirectVmEndpointConsumerBuilder) this;
        }
        /**
         * Name of direct-vm endpoint.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default DirectVmEndpointConsumerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default DirectVmEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default DirectVmEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Direct VM component.
     */
    public interface AdvancedDirectVmEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default DirectVmEndpointConsumerBuilder basic() {
            return (DirectVmEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        default AdvancedDirectVmEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        default AdvancedDirectVmEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedDirectVmEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedDirectVmEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointConsumerBuilder propagateProperties(
                boolean propagateProperties) {
            setProperty("propagateProperties", propagateProperties);
            return this;
        }
        /**
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointConsumerBuilder propagateProperties(
                String propagateProperties) {
            setProperty("propagateProperties", propagateProperties);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Direct VM component.
     */
    public interface DirectVmEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDirectVmEndpointProducerBuilder advanced() {
            return (AdvancedDirectVmEndpointProducerBuilder) this;
        }
        /**
         * Name of direct-vm endpoint.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default DirectVmEndpointProducerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * If sending a message to a direct endpoint which has no active
         * consumer, then we can tell the producer to block and wait for the
         * consumer to become active.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default DirectVmEndpointProducerBuilder block(boolean block) {
            setProperty("block", block);
            return this;
        }
        /**
         * If sending a message to a direct endpoint which has no active
         * consumer, then we can tell the producer to block and wait for the
         * consumer to become active.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default DirectVmEndpointProducerBuilder block(String block) {
            setProperty("block", block);
            return this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a Direct-VM endpoint with no active consumers.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default DirectVmEndpointProducerBuilder failIfNoConsumers(
                boolean failIfNoConsumers) {
            setProperty("failIfNoConsumers", failIfNoConsumers);
            return this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a Direct-VM endpoint with no active consumers.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default DirectVmEndpointProducerBuilder failIfNoConsumers(
                String failIfNoConsumers) {
            setProperty("failIfNoConsumers", failIfNoConsumers);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default DirectVmEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default DirectVmEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The timeout value to use if block is enabled.
         * The option is a <code>long</code> type.
         * @group producer
         */
        default DirectVmEndpointProducerBuilder timeout(long timeout) {
            setProperty("timeout", timeout);
            return this;
        }
        /**
         * The timeout value to use if block is enabled.
         * The option will be converted to a <code>long</code> type.
         * @group producer
         */
        default DirectVmEndpointProducerBuilder timeout(String timeout) {
            setProperty("timeout", timeout);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Direct VM component.
     */
    public interface AdvancedDirectVmEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default DirectVmEndpointProducerBuilder basic() {
            return (DirectVmEndpointProducerBuilder) this;
        }
        /**
         * Sets a HeaderFilterStrategy that will only be applied on producer
         * endpoints (on both directions: request and response). Default value:
         * none.
         * The option is a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * @group producer (advanced)
         */
        default AdvancedDirectVmEndpointProducerBuilder headerFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            setProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * Sets a HeaderFilterStrategy that will only be applied on producer
         * endpoints (on both directions: request and response). Default value:
         * none.
         * The option will be converted to a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * @group producer (advanced)
         */
        default AdvancedDirectVmEndpointProducerBuilder headerFilterStrategy(
                String headerFilterStrategy) {
            setProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointProducerBuilder propagateProperties(
                boolean propagateProperties) {
            setProperty("propagateProperties", propagateProperties);
            return this;
        }
        /**
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointProducerBuilder propagateProperties(
                String propagateProperties) {
            setProperty("propagateProperties", propagateProperties);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointProducerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Direct VM component.
     */
    public interface DirectVmEndpointBuilder
            extends
                DirectVmEndpointConsumerBuilder, DirectVmEndpointProducerBuilder {
        default AdvancedDirectVmEndpointBuilder advanced() {
            return (AdvancedDirectVmEndpointBuilder) this;
        }
        /**
         * Name of direct-vm endpoint.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default DirectVmEndpointBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Direct VM component.
     */
    public interface AdvancedDirectVmEndpointBuilder
            extends
                AdvancedDirectVmEndpointConsumerBuilder, AdvancedDirectVmEndpointProducerBuilder {
        default DirectVmEndpointBuilder basic() {
            return (DirectVmEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointBuilder propagateProperties(
                boolean propagateProperties) {
            setProperty("propagateProperties", propagateProperties);
            return this;
        }
        /**
         * Whether to propagate or not properties from the producer side to the
         * consumer side, and vice versa. Default value: true.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointBuilder propagateProperties(
                String propagateProperties) {
            setProperty("propagateProperties", propagateProperties);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDirectVmEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The direct-vm component provides direct, synchronous call to another
     * endpoint from any CamelContext in the same JVM.
     * Maven coordinates: org.apache.camel:camel-directvm
     */
    default DirectVmEndpointBuilder directVm(String path) {
        class DirectVmEndpointBuilderImpl extends AbstractEndpointBuilder implements DirectVmEndpointBuilder, AdvancedDirectVmEndpointBuilder {
            public DirectVmEndpointBuilderImpl(String path) {
                super("direct-vm", path);
            }
        }
        return new DirectVmEndpointBuilderImpl(path);
    }
}