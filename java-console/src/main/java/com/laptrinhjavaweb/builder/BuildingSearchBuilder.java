package com.laptrinhjavaweb.builder;

public class BuildingSearchBuilder {
	// required parameters
	private String name;
	private String district;

	public String getName() {
		return name;
	}

	public String getDistrict() {
		return district;
	}

	private BuildingSearchBuilder(Builder builder) {
		this.name = builder.name;
		this.district = builder.district;
	}

	// Builder Class
	public static class Builder {

		// required parameters
		private String name;
		private String district;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setDistrict(String district) {
			this.district = district;
			return this;
		}

		public BuildingSearchBuilder build() {
			return new BuildingSearchBuilder(this);
		}

	}
}
