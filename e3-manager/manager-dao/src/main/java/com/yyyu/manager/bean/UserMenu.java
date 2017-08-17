package com.yyyu.manager.bean;

import java.util.List;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/8/17.
 */
public class UserMenu {

    private String text;
    private List<ChildrenBean> children;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<ChildrenBean> getChildren() {
        return children;
    }

    public void setChildren(List<ChildrenBean> children) {
        this.children = children;
    }

    public static class ChildrenBean {
        private String text;
        private AttributesBean attributes;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public AttributesBean getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBean attributes) {
            this.attributes = attributes;
        }

        public static class AttributesBean {
            /**
             * url : item-add
             */

            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
