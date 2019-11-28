package com.xsh.testapplication;

import java.util.List;

/**
 * 功能：
 * 作者：HDM
 * 创建时间：2019/11/18 10:01
 */
public class TestDemo {

    private List<BuildingsBean> buildings;

    public List<BuildingsBean> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<BuildingsBean> buildings) {
        this.buildings = buildings;
    }

    public static class BuildingsBean {
        /**
         * buildingsId : 1
         * name : 1幢
         * units : [{"uName":"1单元","unitsId":"1","status":"在线"},{"uName":"2单元","unitsId":"2","status":"在线"},{"uName":"3单元","unitsId":"1","status":"离线"},{"uName":"4单元","unitsId":"1","status":"离线"}]
         */

        private String buildingsId;
        private String name;
        private List<UnitsBean> units;

        public String getBuildingsId() {
            return buildingsId;
        }

        public void setBuildingsId(String buildingsId) {
            this.buildingsId = buildingsId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<UnitsBean> getUnits() {
            return units;
        }

        public void setUnits(List<UnitsBean> units) {
            this.units = units;
        }

        public static class UnitsBean {
            /**
             * uName : 1单元
             * unitsId : 1
             * status : 在线
             */

            private String uName;
            private String unitsId;
            private String status;

            public String getUName() {
                return uName;
            }

            public void setUName(String uName) {
                this.uName = uName;
            }

            public String getUnitsId() {
                return unitsId;
            }

            public void setUnitsId(String unitsId) {
                this.unitsId = unitsId;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }
        }
    }
}
