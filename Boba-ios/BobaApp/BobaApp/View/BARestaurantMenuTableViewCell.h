//
//  BARestaurantMenuTableViewCell.h
//  BobaApp
//
//  Created by Brandon Tram on 10/5/14.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface BARestaurantMenuTableViewCell : UITableViewCell

@property (weak, nonatomic) IBOutlet UIImageView *itemImageView;
@property (weak, nonatomic) IBOutlet UILabel *itemName;
@property (weak, nonatomic) IBOutlet UILabel *priceLabel;

@end
