package com.igor.creational.singleton.model;

public enum EnumService {

    INSTANCE;

    private String path;

    private void build(ServiceBuilder builder) {
        this.path = builder.path;
    }

    // Static getter
    public static EnumService getService() {
        return INSTANCE;
    }


    public static class ServiceBuilder {

        private final String path;

        private ServiceBuilder(){
            path = null;
        }

        public ServiceBuilder(String name) {
            this.path = name;
        }

        public void build(){
            EnumService.INSTANCE.build(this);
        }
    }


}
