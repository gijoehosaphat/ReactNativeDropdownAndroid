'use strict';

var React = require('react-native');
var { requireNativeComponent, PropTypes, View } = React;

var NativeDropdown = requireNativeComponent('DropdownAndroid', Dropdown);

class Dropdown extends React.Component {
  constructor() {
    super();
    this._onChange = this._onChange.bind(this);
  }

  _onChange(event) {
    if (this.props.onChange) {
      this.props.onChange(event.nativeEvent);
    }
  }

  render() {
    return (
      <NativeDropdown {...this.props}
          onChange={this._onChange}
          values={this.props.values}
          selected={this.props.selected}
          fontSize={this.props.fontSize}
          fontColor={this.props.fontColor}
          dropdownItemPadding={this.props.dropdownItemPadding}
      />
    );
  }
}

Dropdown.propTypes = {
  ...View.propTypes,
  fontColor: PropTypes.string,
  fontSize: PropTypes.number,
  dropdownItemPadding: PropTypes.number,
  values: PropTypes.array.isRequired,
  selected: PropTypes.number,
  onChange: PropTypes.func
};

Dropdown.defaultProps = {
  fontColor: '#666666',
  fontSize: 14,
  dropdownItemPadding: 10,
  values: [ '' ],
  selected: 0
}

module.exports = Dropdown;
